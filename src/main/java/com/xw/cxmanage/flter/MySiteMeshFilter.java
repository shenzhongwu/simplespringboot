package com.xw.cxmanage.flter;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class MySiteMeshFilter extends ConfigurableSiteMeshFilter {
    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
    	builder
    	.addDecoratorPath("/*", "/WEB-INF/jsp/decorators/index.jsp")
    	.addExcludedPath("/login")
    	;
    }
    

}
