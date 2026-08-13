.class final LN7/b;
.super LL7/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN7/b$a;
    }
.end annotation


# static fields
.field public static final h:LN7/b$a;

.field private static final i:LL7/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LN7/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LN7/b$a;-><init>(Ly7/k;)V

    sput-object v0, LN7/b;->h:LN7/b$a;

    new-instance v0, LN7/b;

    invoke-direct {v0}, LN7/b;-><init>()V

    sput-object v0, LN7/b;->i:LL7/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    new-instance v0, LE8/f;

    const-string v1, "FallbackBuiltIns"

    invoke-direct {v0, v1}, LE8/f;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, LL7/g;-><init>(LE8/n;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LL7/g;->f(Z)V

    return-void
.end method

.method public static final synthetic F0()LL7/g;
    .locals 1

    sget-object v0, LN7/b;->i:LL7/g;

    return-object v0
.end method


# virtual methods
.method protected G0()LQ7/c$a;
    .locals 1

    sget-object v0, LQ7/c$a;->a:LQ7/c$a;

    return-object v0
.end method

.method public bridge synthetic M()LQ7/c;
    .locals 1

    invoke-virtual {p0}, LN7/b;->G0()LQ7/c$a;

    move-result-object v0

    return-object v0
.end method
