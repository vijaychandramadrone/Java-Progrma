package de.laliluna.logexample;

import java.io.File;

import org.apache.log4j.RollingFileAppender;

public class MyRollingFile extends RollingFileAppender {
    /**
     * A default file path if no value is set in the log4j.xml.
     */
    private static final String defaultFilePath = ".";

    /**
     * A default date pattern if no value is set in the log4j.xml.
     */
    private static final String defaultDatePattern = "yyMMdd";

    /**
     * This is the absolute path were the logger-structure should be created.
     */
    protected String filePath = null;

    /**
     * This is the filename of the log-file.
     */
    protected String file = null;

    /**
     * This is a date pattern used to create a directory for each day.
     * 
     * @see SimpleDateFormat
     */
    protected String datePattern = null;

    /**
     * The default maximum file size is 10MB.
     */
    protected long maxFileSize;

    /**
     * There is one backup file by default.
     */
    protected int maxBackupIndex;

    /**
     * The default constructor does nothing.
     */
    public MyRollingFile() {
        maxFileSize = 10485760L;
        maxBackupIndex = 1;
        System.out.println("Appender called");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void activateOptions() {
        setupLogFile();
        super.activateOptions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setFile(final String file) {
        this.file = file;
    }

    /**
     * Gets the date pattern.
     * 
     * @return the date pattern.
     */
    public String getDatePattern() {
        return datePattern;
    }

    /**
     * Sets the date pattern.
     * 
     * @param datePattern
     * the date pattern to set.
     */
    public void setDatePattern(final String datePattern) {
        this.datePattern = datePattern;
    }

    /**
     * Gets the file path.
     * 
     * @return the file path.
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the file path.
     * 
     * @param filePath
     * the file path to set.
     */
    public void setFilePath(final String filePath) {
        this.filePath = filePath;
    }

    /**
     * This method sets up the logfile structure. This method creates the needed
     * directories and builds the log-filename.
     */
    private void setupLogFile() {
        if (file != null) {
            if (filePath == null) {
                filePath = defaultFilePath;
            }

            if (datePattern == null) {
                datePattern = defaultDatePattern;
            }

            // build logfile-path
            final String userName = System.getProperty("user.name");
            final String fileName = file.replace("@username@", userName);

            // create file if not exists
            final String parentName = new File(fileName).getParent();
            if (parentName != null) {
                final File parentDir = new File(parentName);
                if (!parentDir.exists()) {
                    parentDir.mkdirs();
                }
            }

            // find first not existing logfile
            final File f = new File(fileName);

            super.setFile(f.getAbsoluteFile().toString());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void reset() {
        filePath = null;
        file = null;
        datePattern = null;
        super.reset();
    }
}