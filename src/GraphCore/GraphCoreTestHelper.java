package GraphCore;


/**
* GraphCore/GraphCoreTestHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from src/GraphCore.idl
* Friday, August 20, 2021 1:09:22 AM CEST
*/

abstract public class GraphCoreTestHelper
{
  private static String  _id = "IDL:GraphCore/GraphCoreTest:1.0";

  public static void insert (org.omg.CORBA.Any a, GraphCore.GraphCoreTest that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static GraphCore.GraphCoreTest extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (GraphCore.GraphCoreTestHelper.id (), "GraphCoreTest");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static GraphCore.GraphCoreTest read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_GraphCoreTestStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, GraphCore.GraphCoreTest value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static GraphCore.GraphCoreTest narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof GraphCore.GraphCoreTest)
      return (GraphCore.GraphCoreTest)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      GraphCore._GraphCoreTestStub stub = new GraphCore._GraphCoreTestStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static GraphCore.GraphCoreTest unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof GraphCore.GraphCoreTest)
      return (GraphCore.GraphCoreTest)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      GraphCore._GraphCoreTestStub stub = new GraphCore._GraphCoreTestStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
