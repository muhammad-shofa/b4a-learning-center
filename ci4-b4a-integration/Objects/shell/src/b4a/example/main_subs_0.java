package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,25);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(33554432);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 27;BA.debugLine="Log(\"Anjayyyyyyyy\")";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6131074",RemoteObject.createImmutable("Anjayyyyyyyy"),0);
 BA.debugLineNum = 28;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(134217728);
_job = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 29;BA.debugLine="Job.Initialize(\"getUserData\", Me)";
Debug.ShouldStop(268435456);
_job.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("getUserData")),(Object)(main.getObject()));
 BA.debugLineNum = 30;BA.debugLine="Job.Download(\"http://192.168.1.4:8080/api/getUser";
Debug.ShouldStop(536870912);
_job.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("http://192.168.1.4:8080/api/getUser")));
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,54);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 54;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,50);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,58);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button1_click");}
 BA.debugLineNum = 58;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
Debug.ShouldStop(67108864);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("Hello world!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("B4X"))));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,33);
if (RapidSub.canDelegate("jobdone")) { return b4a.example.main.remoteMe.runUserSub(false, "main","jobdone", _job);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 33;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(2);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 35;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(4);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 36;BA.debugLine="parser.initialize(Job.GetString)";
Debug.ShouldStop(8);
_parser.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 37;BA.debugLine="Dim data As List = parser.NextArray";
Debug.ShouldStop(16);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_data = _parser.runMethod(false,"NextArray");Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 39;BA.debugLine="For Each item As Map In data";
Debug.ShouldStop(64);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group5 = _data;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group5.runMethod(false,"Get",index5));Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 40;BA.debugLine="Log(\"Name : \" & item.Get(\"name\"))";
Debug.ShouldStop(128);
main.mostCurrent.__c.runVoidMethod ("LogImpl","63735559",RemoteObject.concat(RemoteObject.createImmutable("Name : "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))),0);
 BA.debugLineNum = 41;BA.debugLine="Log(\"Username : \" & item.Get(\"username\"))";
Debug.ShouldStop(256);
main.mostCurrent.__c.runVoidMethod ("LogImpl","63735560",RemoteObject.concat(RemoteObject.createImmutable("Username : "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username"))))),0);
 BA.debugLineNum = 42;BA.debugLine="Log(\"Email :\" & item.Get(\"email\"))";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethod ("LogImpl","63735561",RemoteObject.concat(RemoteObject.createImmutable("Email :"),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email"))))),0);
 }
}Debug.locals.put("item", _item);
;
 }else {
 BA.debugLineNum = 45;BA.debugLine="Log(\"Error + \" & Job.ErrorMessage)";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("LogImpl","63735564",RemoteObject.concat(RemoteObject.createImmutable("Error + "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 };
 BA.debugLineNum = 47;BA.debugLine="Job.Release";
Debug.ShouldStop(16384);
_job.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
httputils2service.myClass = BA.getDeviceClass ("b4a.example.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4a.example.httpjob");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}