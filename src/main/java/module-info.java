open module org.jabref {
    exports org.jabref;

    exports org.jabref.gui;
    exports org.jabref.gui.logging;
    exports org.jabref.gui.maintable;
    exports org.jabref.gui.specialfields;

    exports org.jabref.model.database;

    exports org.jabref.logic;
    exports org.jabref.logic.citationstyle;
    exports org.jabref.logic.search;

    // Swing
	requires java.desktop;

	// SQL
	requires java.sql;

	// JavaFX
	requires javafx.graphics;
	requires javafx.swing;
	requires javafx.controls;
	requires javafx.web;
	requires javafx.fxml;
	requires afterburner.fx;
	requires com.jfoenix;
    requires de.saxsys.mvvmfx;
    requires de.jensd.fx.glyphs.commons;
    requires de.jensd.fx.glyphs.materialdesignicons;
    requires org.controlsfx.controls;

    provides com.airhacks.afterburner.views.ResourceLocator
        with org.jabref.gui.util.JabRefResourceLocator;

    provides com.airhacks.afterburner.injection.PresenterFactory
        with org.jabref.gui.DefaultInjector;

	// Logging
	requires org.slf4j;
	requires org.apache.logging.log4j;

	// Preferences and XML
	requires java.prefs;
    requires java.xml.bind;
    requires jdk.xml.dom;

    // Annotations (@PostConstruct)
    requires java.annotation;

    // Microsoft application insights
    requires applicationinsights.core;

    // Libre Office
    requires org.jabref.thirdparty.libreoffice;

    // Other modules
    requires commons.logging;
    requires com.google.common;
    requires easybind;
    requires javax.inject;
    requires pdfbox;
    requires reactfx;
    requires commons.cli;
}
