.class public final LF8/d0$c$c;
.super LF8/d0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF8/d0$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:LF8/d0$c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF8/d0$c$c;

    invoke-direct {v0}, LF8/d0$c$c;-><init>()V

    sput-object v0, LF8/d0$c$c;->a:LF8/d0$c$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LF8/d0$c;-><init>(Ly7/k;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LF8/d0;LJ8/i;)LJ8/j;
    .locals 0

    invoke-virtual {p0, p1, p2}, LF8/d0$c$c;->b(LF8/d0;LJ8/i;)Ljava/lang/Void;

    move-result-object p1

    check-cast p1, LJ8/j;

    return-object p1
.end method

.method public b(LF8/d0;LJ8/i;)Ljava/lang/Void;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "type"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Should not be called"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
