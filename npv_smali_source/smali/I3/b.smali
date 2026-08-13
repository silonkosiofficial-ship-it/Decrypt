.class public abstract LI3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LO3/a;

.field public static final b:LJ3/a;

.field public static final c:LO3/a$g;

.field private static final d:LO3/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LO3/a$g;

    invoke-direct {v0}, LO3/a$g;-><init>()V

    sput-object v0, LI3/b;->c:LO3/a$g;

    new-instance v1, LI3/h;

    invoke-direct {v1}, LI3/h;-><init>()V

    sput-object v1, LI3/b;->d:LO3/a$a;

    new-instance v2, LO3/a;

    const-string v3, "Auth.PROXY_API"

    invoke-direct {v2, v3, v1, v0}, LO3/a;-><init>(Ljava/lang/String;LO3/a$a;LO3/a$g;)V

    sput-object v2, LI3/b;->a:LO3/a;

    new-instance v0, Lb4/d;

    invoke-direct {v0}, Lb4/d;-><init>()V

    sput-object v0, LI3/b;->b:LJ3/a;

    return-void
.end method
