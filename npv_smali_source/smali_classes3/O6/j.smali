.class public abstract LO6/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LW6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const-class v0, Lb7/a;

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    :try_start_0
    invoke-static {v0}, Ly7/P;->p(Ljava/lang/Class;)LF7/o;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x0

    :goto_0
    new-instance v2, Lb7/a;

    invoke-direct {v2, v1, v0}, Lb7/a;-><init>(LF7/c;LF7/o;)V

    new-instance v0, LW6/a;

    const-string v1, "BodyTypeAttributeKey"

    invoke-direct {v0, v1, v2}, LW6/a;-><init>(Ljava/lang/String;Lb7/a;)V

    sput-object v0, LO6/j;->a:LW6/a;

    return-void
.end method

.method public static final a()LW6/a;
    .locals 1

    sget-object v0, LO6/j;->a:LW6/a;

    return-object v0
.end method
