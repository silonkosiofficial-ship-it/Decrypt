.class public abstract LV9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LX9/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, LX9/g;->F:LX9/g$a;

    const-string v1, "000000ffff"

    invoke-virtual {v0, v1}, LX9/g$a;->a(Ljava/lang/String;)LX9/g;

    move-result-object v0

    sput-object v0, LV9/b;->a:LX9/g;

    return-void
.end method

.method public static final synthetic a()LX9/g;
    .locals 1

    sget-object v0, LV9/b;->a:LX9/g;

    return-object v0
.end method
