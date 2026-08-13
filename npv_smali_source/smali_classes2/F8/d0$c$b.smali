.class public final LF8/d0$c$b;
.super LF8/d0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF8/d0$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:LF8/d0$c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF8/d0$c$b;

    invoke-direct {v0}, LF8/d0$c$b;-><init>()V

    sput-object v0, LF8/d0$c$b;->a:LF8/d0$c$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LF8/d0$c;-><init>(Ly7/k;)V

    return-void
.end method


# virtual methods
.method public a(LF8/d0;LJ8/i;)LJ8/j;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LF8/d0;->j()LJ8/o;

    move-result-object p1

    invoke-interface {p1, p2}, LJ8/o;->z(LJ8/i;)LJ8/j;

    move-result-object p1

    return-object p1
.end method
