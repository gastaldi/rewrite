/*
 * Copyright 2013 <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ocpsoft.urlbuilder;

/**
 * An {@link Address} with a path.
 * 
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 */
public class AddressBuilderPath implements BuildableAddress
{
   private AddressBuilder parent;

   AddressBuilderPath(AddressBuilder parent)
   {
      this.parent = parent;
   }

   @Override
   public Address build()
   {
      return parent.build();
   }

   @Override
   public Address buildLiteral()
   {
      return parent.buildLiteral();
   }

   /**
    * Set a query-parameter to a value or multiple values. The given name and values will be stored without additional
    * encoding or decoding.
    */
   public AddressBuilderQuery query(CharSequence name, Object... values)
   {
      return parent.query(name, values);
   }

   /**
    * Set a query-parameter value or multiple values. The given name and values be decoded before they are stored.
    */
   public AddressBuilderQuery queryDecoded(CharSequence name, Object... values)
   {
      return parent.queryDecoded(name, values);
   }

   /**
    * Set a query-parameter to a value or multiple values. The given name and values be encoded before they are stored.
    */
   public AddressBuilderQuery queryEncoded(CharSequence name, Object... values)
   {
      return parent.queryEncoded(name, values);
   }

   /**
    * Set a literal query string without additional encoding or decoding. A leading '?' character is optional; the
    * builder will add one if necessary.
    */
   public AddressBuilderQuery queryLiteral(String query)
   {
      return parent.queryLiteral(query);
   }

   /**
    * Set the anchor section of this {@link Address}.
    */
   public AddressBuilderAnchor anchor(String anchor)
   {
      return parent.anchor(anchor);
   }

   /**
    * Set a parameter name and value or values. The supplied values will be stored without additional encoding.
    */
   public AddressBuilderPath set(CharSequence name, Object... values)
   {
      parent.set(name, values);
      return this;
   }

   /**
    * Set a parameter name and value or values. The values will be decoded before they are stored.
    */
   public AddressBuilderPath setDecoded(CharSequence name, Object... values)
   {
      parent.setDecoded(name, values);
      return this;
   }

   /**
    * Set a parameter name and value or values. The values will be encoded before they are stored.
    */
   public AddressBuilderPath setEncoded(CharSequence name, Object... values)
   {
      parent.setEncoded(name, values);
      return this;
   }

   @Override
   public String toString()
   {
      return parent.toString();
   }
}
