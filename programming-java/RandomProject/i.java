body
{
  font-family: "Lucida Grande", Verdana, Arial, Helvetica, sans-serif;
  margin: 8px;
  background-color: #F6F6F6;
  color: #000;
  font-size: 12px;
}

body.iframe
{
  margin: 20px 0 0 0;
  background-color: #FFF;
}

body.extwin
{
  margin: 10px;
}

td, th, div, p, select, input, textarea
{
  font-size: 12px;
  font-family: inherit;
}

th
{
  font-weight: normal;
}

h3
{
  font-size: 18px;
}

a, a:active, a:visited
{
  color: #000;
  outline: none;
}

a.button, a.button:visited, a.tab, a.tab:visited, a.axislist
{
  color: #000;
  text-decoration: none;
}

a.tab
{
  width: 80px;
  display: block;
  text-align: center;
}

hr
{
  height: 1px;
  background-color: #666;
  border-style: none;
}

input[type="text"],
input[type="button"],
input[type="password"],
textarea
{
  border: 1px solid #666;
  color: #333;
  background-color: #FFF;
}

input, textarea
{
  color: black;
  padding: 1px 3px;
}

input.placeholder,
textarea.placeholder
{
  color: #aaa;
}

input.button
{
  height: 20px;
  color: #333333;
  font-size: 12px;
  padding-left: 8px;
  padding-right: 8px;
  background: url(images/buttons/bg.gif) repeat-x #f0f0f0;
  border: 1px solid #a4a4a4;
}

input.button:hover
{
  color: black;
}

input.button[disabled],
input.button[disabled]:hover
{
  color: #aaa;
  border-color: #ccc;
}

input.mainaction
{
  font-weight: bold;
  border: 1px solid #999;
}

img
{
  border: 0;
}

.alttext
{
  font-size: 11px;
}

.hint
{
  color: #666;
  font-size: 11px;
}

.formlinks a,
.formlinks a:visited
{
  color: #CC0000;
  font-size: 11px;
  text-decoration: none;
}

.formlinks a.disabled,
.formlinks a.disabled:visited
{
  color: #999999;
}

/** common user interface objects */

#mainscreen
{
  position: absolute;
  top: 85px;
  right: 20px;
  bottom: 20px;
  left: 20px;
}

#header
{
  position: absolute;
  top: 8px;
  left: 19px;
  width: 170px;
  height: 40px;
  z-index: 100;
}

#taskbar
{
  position: absolute;
  top: 0px;
  right: 0px;
  height: 24px;
  width: 100%;
  background: url(images/taskbar.png) top right no-repeat;
  padding: 10px 6px 5px 0px;
  text-align: right;
  white-space: nowrap;
  z-index: 2;
}

#taskbar a
{
  font-size: 11px;
  color: #666666;
  text-decoration: none;
  padding: 6px 12px 6px 26px;
  background: url(images/taskicons.gif) no-repeat;
}

#taskbar a:hover
{
  color: #333333;
}

#taskbar a.button-mail
{
  background-position: 0 0;
}

#taskbar a.button-addressbook
{
  background-position: 0 -25px;
}

#taskbar a.button-settings
{
  background-position: 0 -50px;
}

#taskbar a.button-logout
{
  background-position: 0 -75px;
}

#message
{
  position: absolute;
  display: none;
  top: -1px;
  margin-left: -225px;
  left: 50%;
  z-index: 5000;
  opacity: 0.85;
}

#message div
{
  width: 400px;
  margin: 0px;
  min-height: 22px;
  padding: 8px 10px 8px 46px;
}

#message div.notice,
#message-objects div.notice
{
  background: url(images/display/icons.png) 6px 3px no-repeat;
  background-color: #F7FDCB;
  border: 1px solid #C2D071;
}

#message div.error,
#message div.warning,
#message-objects div.warning,
#message-objects div.error
{
  background: url(images/display/icons.png) 6px -97px no-repeat;
  background-color: #EF9398;
  border: 1px solid #DC5757;
}

#message div.confirmation,
#message-objects div.confirmation
{
  background: url(images/display/icons.png) 6px -47px no-repeat;
  background-color: #A6EF7B;
  border: 1px solid #76C83F;
}

#message div.loading,
#message-objects div.loading
{
  background: url(images/display/loading.gif) 6px 3px no-repeat;
  background-color: #EBEBEB;
  border: 1px solid #CCCCCC;
}

#message a
{
  cursor: pointer;
  text-decoration: underline;
}

.box
{
  border: 1px solid #999;
}

.boxtitle
{
  height: 12px !important;
  padding: 2px 10px 5px 5px;
  border-bottom: 1px solid #999;
  color: #333;
  font-size: 11px;
  font-weight: bold;
  overflow: hidden;
  text-overflow: ellipsis;
  -o-text-overflow: ellipsis;
  white-space: nowrap;
  background: url(images/listheader.gif) top left repeat-x #CCC;
}

.boxtitle .rightalign
{
  float: right;
}

body.iframe .boxtitle
{
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
}

.boxcontent
{
  padding: 15px 10px 10px 10px;
  background-color: #F2F2F2;
}

.boxcontent table td.title
{
  color: #666;
  padding-right: 10px;
}

.boxlistcontent
{
  position: absolute;
  top: 20px;
  bottom: 22px;
  left: 0;
  right: 0;
  width: 100%;
  overflow-y: auto;
  overflow-x: hidden;
}

.boxsubject
{
  position: absolute;
  top: 0px;
  left: 0px;
  right: 0px;
  overflow: hidden;
  height: 22px;
  border-bottom: 1px solid #999;
  background: url(images/listheader.gif) top left repeat-x #CCC;
}

.boxfooter
{
  position: absolute;
  bottom: 0px;
  left: 0px;
  right: 0px;
  overflow: hidden;
  height: 22px;
  border-top: 1px solid #999;
  background: url(images/listheader.gif) top left repeat-x #CCC;
}

.boxfooter a.button,
.boxfooter a.buttonPas
{
  display: block;
  float: left;
  width: 34px;
  height: 22px;
  padding: 0px;
  margin: 0;
  overflow: hidden;
  background: url(images/icons/groupactions.png) 0 0 no-repeat transparent;
  opacity: 0.99; /* this is needed to make buttons appear correctly in Chrome */
}

.boxfooter a.groupactions
{
  background-position: 0 -26px;
}

.boxfooter a.buttonPas
{
  opacity: 0.35;
}

.pagenav
{
  min-width: 250px;
}

.pagenav span
{
  color: #444;
  font-size: 11px;
  text-shadow: white 1px 1px;
  white-space: nowrap;
}

.pagenav a.button,
.pagenav a.buttonPas
{
  display: block;
  float: left;
  width: 11px;
  height: 11px;
  padding: 0;
  margin: 1px;
  overflow: hidden;
  background: url(images/pagenav.gif) 0 0 no-repeat transparent;
  opacity: 0.99; /* this is needed to make buttons appear correctly in Chrome */
}

.pagenav a.buttonPas {
  opacity: 0.35;
}

.pagenav a.firstpageSel {
  background-position: 0 -11px;
}

.pagenav a.prevpage {
  background-position: -11px 0;
}

.pagenav a.prevpageSel {
  background-position: -11px -11px;
}

.pagenav a.nextpage {
  background-position: -22px 0;
}

.pagenav a.nextpageSel {
  background-position: -22px -11px;
}

.pagenav a.lastpage {
  background-position: -33px 0;
}

.pagenav a.lastpageSel {
  background-position: -33px -11px;
}

.splitter
{
  user-select: none;
  -moz-user-select: none;
  -khtml-user-select: none;
  position: absolute;
  background: url(images/dimple.png) center no-repeat;
}

.splitter-h
{
  cursor: n-resize; cursor: row-resize;
  background-position: center 2px;
}

.splitter-v
{
  cursor: e-resize; cursor: col-resize;
  background-position: 2px center;
}

.popupmenu
{
  position: absolute;
  top: 32px;
  left: 90px;
  width: auto;
  display: none;
  background-color: #fff;
  background-color: rgba(255, 255, 255, 0.95);
  border: 1px solid #999;
  padding: 4px;
  z-index: 240;
  border-radius: 3px;
  -moz-border-radius: 3px;
  -webkit-border-radius: 3px;
  -moz-box-shadow: 1px 1px 12px #999;
  -webkit-box-shadow: #999 1px 1px 12px;
}

.popupmenu ul
{
  margin: -4px 0;
  padding: 0;
  list-style: none;
}

.popupmenu ul li
{
  font-size: 11px;
  white-space: nowrap;
  min-width: 100px;
  margin: 3px -4px;
}

.popupmenu li a
{
  display: block;
  color: #a0a0a0;
  padding: 2px 10px;
  text-decoration: none;
  min-height: 14px;
}

.popupmenu li a.active,
.popupmenu li a.active:active,
.popupmenu li a.active:visited
{
  color: #333;
}

.popupmenu li a.active:hover
{
  color: #fff;
  background-color: #c00;
}

.popupmenu li.block input
{
  float: left;
}

.darkbg
{
  background-color: #F2F2F2 !important;
}

.dropbutton,
.dropbutton span
{
  float: left;
  height: 32px;
}

.dropbutton:hover
{
/*  background: url(images/dbutton.png) 0 0 no-repeat transparent; */
}

.dropbutton span
{
  width: 9px;
  background: url(images/dbutton.png) -53px 0 no-repeat transparent;
}

.dropbutton span:hover
{
  cursor: pointer;
  background-position: -74px 0;
}


/***** common table settings ******/

table.records-table thead tr td
{
  height: 20px;
  padding: 0px 4px 0px 4px;
  vertical-align: middle;
  border-bottom: 1px solid #999999;
  color: #333333;
  background: url(images/listheader.gif) top left repeat-x #CCC;
  font-size: 11px;
  font-weight: bold;
}

table.records-table tbody tr td
{
  height: 16px;
  padding: 2px 4px 2px 4px;
  font-size: 11px;
  white-space: nowrap;
  border-bottom: 1px solid #EBEBEB;
  overflow: hidden;
  text-align: left;  
}

table.records-table tr
{
  background-color: #FFFFFF;
}

table.records-table tr.selected td
{
  color: #FFFFFF;
  background-color: #CC3333;
}

table.records-table tr.focused td
{
}

table.records-table tr.unfocused td
{
  color: #FFFFFF;
  background-color: #929292;
}


/***** mac-style quicksearch field *****/

#quicksearchbar
{
  position: absolute;
  top: 55px;
  right: 30px;
  width: 190px;
  height: 20px;
  text-align: right;
  background: url(images/searchfield.gif) top left no-repeat;
}

#searchreset
{
  position: absolute;
  top: 3px;
  right: 12px;
  text-decoration: none;
}

#searchmenulink
{
 position: absolute;
 top: 3px;
 right: 168px;
}

#quicksearchbar img
{
  vertical-align: middle;
}

#quicksearchbox
{
  position: absolute;
  top: 2px;
  left: 24px;
  width: 140px;
  height: 15px;
  font-size: 11px;
  padding: 0px;
  border: none;
}

/***** roundcube webmail pre-defined classes *****/

#rcmversion
{
  position: absolute;
  bottom: 10px;
  right: 20px;
  text-align: right;
  white-space: nowrap;
  font-size: 8pt;
  color: #999;
}

#rcmdraglayer
{
  min-width: 300px;
  width: auto !important;
  width: 300px;
  border: 1px solid #999999;
  background-color: #fff;
  padding-left: 8px;
  padding-right: 8px;
  padding-top: 3px;
  padding-bottom: 3px;
  font-size: 11px;
  white-space: nowrap;
  opacity: 0.82;
  border-radius: 3px;
  -moz-border-radius: 3px;
  -webkit-border-radius: 3px;
  -moz-box-shadow: 1px 1px 12px #999;
  -webkit-box-shadow: #999 1px 1px 12px;
}

.draglayercopy:before
{
  position: absolute;
  bottom: -5px;
  left: -6px;
  content: " ";
  width: 14px;
  height: 14px;
  background: url(images/messageactions.png) -2px -128px no-repeat;
}

a.rcmContactAddress
{
  text-decoration: none;
}

a.rcmContactAddress:hover
{
  text-decoration: underline;
}

#rcmKSearchpane
{
  background-color: #F9F9F9;
  border: 1px solid #CCCCCC;
}

#rcmKSearchpane ul
{
  margin: 0px;
  padding: 2px;
  list-style-image: none;
  list-style-type: none;
}

#rcmKSearchpane ul li
{
  display: block;
  height: 16px;
  font-size: 11px;
  padding-left: 6px;
  padding-top: 2px;
  padding-right: 6px;
  white-space: nowrap;
  cursor: pointer;
}

#rcmKSearchpane ul li.selected
{
  color: #ffffff;
  background-color: #CC3333;
}

#login-form
{
  margin-left: auto;
  margin-right: auto;
  margin-top: 50px;
  width: 420px;
  border: 1px solid #999;
}

#login-form table td.title
{
  text-align: right;
  white-space: nowrap;
}

#login-form table
{
  width: 1%;
  margin: auto;
}

#login-form table td.input input
{
  width: 200px;
}

#console
{
  opacity: 0.8;
}

.disabled
{
  color: #999;
}

font.bold
{
  font-weight: bold;
}


/***** onclick menu list *****/

ul.toolbarmenu
{
  margin: -4px 0 -4px 0;
  padding: 0;
  list-style: none;
}

ul.toolbarmenu li
{
  font-size: 11px;
  white-space: nowrap;
  min-width: 130px;
  margin: 2px -4px;
}

ul.toolbarmenu li a
{
  display: block;
  color: #a0a0a0;
  padding: 1px 12px 3px 28px;
  text-decoration: none;
  min-height: 14px;
}

ul.toolbarmenu li a.active,
ul.toolbarmenu li a.active:active,
ul.toolbarmenu li a.active:visited
{
  color: #333;
}

ul.toolbarmenu li input
{
  vertical-align: middle;
}

ul.toolbarmenu li hr
{
  color: #ccc;
  width: 130px;
  height: 1px;
  margin: 2px 1px 2px 1px;
}

ul.toolbarmenu li img
{
  float: left;
  margin: 0 2px;
}

div.popupmenu ul li.separator_below,
ul.toolbarmenu li.separator_below
{
  border-bottom: 1px solid #ccc;
  margin-bottom: 2px;
  padding-bottom: 2px;
}

div.popupmenu ul li.separator_above,
ul.toolbarmenu li.separator_above
{
  border-top: 1px solid #ccc;
  margin-top: 2px;
  padding-top: 2px;
}

#searchmenu
{
  width: 160px;
}

#searchmenu ul.toolbarmenu
{
  margin: 0;
}

#searchmenu ul.toolbarmenu li
{
  margin: 1px 4px 1px;
}


/***** tabbed interface elements *****/

div.tabsbar,
#tabsbar
{
  position: absolute;
  top: 50px;
  left: 220px;
  right: 20px;
  height: 22px;
  border-bottom: 1px solid #999999;
  white-space: nowrap;
}

div.tabsbar
{
  top: 35px;
  left: 12px;
  right: 12px;
}

span.tablink,
span.tablink-selected
{
  float: left;
  height: 23px !important;
  height: 22px;
  overflow: hidden;
  background: url(images/tabs-left.gif) top left no-repeat;
}

span.tablink
{
  cursor: pointer;
}

span.tablink-selected
{
  cursor: default;
  background-position: 0px -23px;
}

span.tablink a,
span.tablink-selected a
{
  display: inline-block;
  padding: 5px 10px 0 5px;
  margin-left: 5px;
  height: 23px;
  color: #555555;
  max-width: 185px;
  text-decoration: none;
  overflow: hidden;
  text-overflow: ellipsis;
  -o-text-overflow: ellipsis;
  background: url(images/tabs-right.gif) top right no-repeat;
}

span.tablink-selected a
{
  cursor: inherit;
  color: #000000;
  background-position: right -23px;
}

fieldset
{
  margin-bottom: 1em;
  border: 1px solid #999999;
  padding: 4px 8px 9px 8px; 
}

legend
{
  color: #999999;
}

fieldset.tabbed
{
  margin-top: 22px;
  padding-top: 12px;
}

.quota_text {
  text-align: center;
  font-size: 10px;
  color: #666;
  border: 1px solid #999;
  cursor: default;
}
.quota_bg { background-color: white; }
.quota_high { background: url(images/quota-colors.png) repeat-x 0 -28px #f90509; }
.quota_mid { background: url(images/quota-colors.png) repeat-x 0 -14px #e3e909; }
.quota_low { background: url(images/quota-colors.png) repeat-x 0 0px #05f905; }
.quota_text_high { color: white; }
.quota_text_mid { color: #666; }
.quota_text_low { color: #666; }
