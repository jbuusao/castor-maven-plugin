/*
 * Copyright 2005 The Codehaus.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.codehaus.mojo.castor;

import org.apache.maven.plugins.annotations.Parameter;

/**
 * A mojo that uses Castor MappingTool to generate mapping files from a single Class.
 * 
 * @goal mapping
 * @phase process-classes
 * @author nicolas
 */
public class MappingMojo
    extends AbstractMappingMojo
{
    /**
     * The name of the Java class from which a mapping file should be generated.
     */
    @Parameter(property = "className", required = true)
    private String className;

    /**
     * Name of the mapping file to be generated.
     * 
     */
    @Parameter(property = "mappingName", required = true)
    private String mappingName;

    /**
     * {@inheritDoc}
     * 
     * @see org.codehaus.mojo.castor.AbstractMappingMojo#getClassName()
     */
    protected String getClassName()
    {
        return className;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.codehaus.mojo.castor.AbstractMappingMojo#getMappingName()
     */
    protected String getMappingName()
    {
        return mappingName;
    }
}
