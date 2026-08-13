.class final LF0/q0$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/q0;-><init>(Lx7/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LF0/q0$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF0/q0$f;

    invoke-direct {v0}, LF0/q0$f;-><init>()V

    sput-object v0, LF0/q0$f;->D:LF0/q0$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/J;)V
    .locals 7

    .prologue
    invoke-virtual {p1}, LF0/J;->R()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, LF0/J;->s1(LF0/J;ZZZILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/J;

    invoke-virtual {p0, p1}, LF0/q0$f;->a(LF0/J;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
