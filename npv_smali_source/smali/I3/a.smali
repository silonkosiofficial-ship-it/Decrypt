.class public abstract LI3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LO3/a;

.field public static final b:LO3/a;

.field public static final c:LJ3/a;

.field public static final d:LK3/a;

.field public static final e:LO3/a$g;

.field public static final f:LO3/a$g;

.field private static final g:LO3/a$a;

.field private static final h:LO3/a$a;

.field public static final i:LO3/a;

.field public static final j:Lc4/e;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LO3/a$g;

    invoke-direct {v0}, LO3/a$g;-><init>()V

    sput-object v0, LI3/a;->e:LO3/a$g;

    new-instance v1, LO3/a$g;

    invoke-direct {v1}, LO3/a$g;-><init>()V

    sput-object v1, LI3/a;->f:LO3/a$g;

    new-instance v2, LI3/d;

    invoke-direct {v2}, LI3/d;-><init>()V

    sput-object v2, LI3/a;->g:LO3/a$a;

    new-instance v3, LI3/e;

    invoke-direct {v3}, LI3/e;-><init>()V

    sput-object v3, LI3/a;->h:LO3/a$a;

    sget-object v4, LI3/b;->a:LO3/a;

    sput-object v4, LI3/a;->a:LO3/a;

    new-instance v4, LO3/a;

    const-string v5, "Auth.CREDENTIALS_API"

    invoke-direct {v4, v5, v2, v0}, LO3/a;-><init>(Ljava/lang/String;LO3/a$a;LO3/a$g;)V

    sput-object v4, LI3/a;->i:LO3/a;

    new-instance v0, LO3/a;

    const-string v2, "Auth.GOOGLE_SIGN_IN_API"

    invoke-direct {v0, v2, v3, v1}, LO3/a;-><init>(Ljava/lang/String;LO3/a$a;LO3/a$g;)V

    sput-object v0, LI3/a;->b:LO3/a;

    sget-object v0, LI3/b;->b:LJ3/a;

    sput-object v0, LI3/a;->c:LJ3/a;

    new-instance v0, Lc4/e;

    invoke-direct {v0}, Lc4/e;-><init>()V

    sput-object v0, LI3/a;->j:Lc4/e;

    new-instance v0, LL3/h;

    invoke-direct {v0}, LL3/h;-><init>()V

    sput-object v0, LI3/a;->d:LK3/a;

    return-void
.end method
