<#--
 * Copyright (c) Open Source Strategies, Inc.
 * 
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
-->

<@import location="component://opentaps-common/webapp/common/includes/lib/opentapsFormMacros.ftl" />

<#if teams?has_content>
  <table class="crmsfaListTable">
    <tr class="crmsfaListTableHeader">
      <td><span class="tableheadtext">${uiLabelMap.CommonName}</span></td>
      <td><span class="tableheadtext">${uiLabelMap.CommonComments}</span></td>
    </tr>
    <#list teams as team>
      <tr class="${tableRowClass(team_index)}">
        <@displayLinkCell text=team.groupName href="viewTeam?partyId=${team.partyId}" />
        <@displayCell text=team.partyGroupComments />
      </tr>
    </#list>
  </table>
</#if>
