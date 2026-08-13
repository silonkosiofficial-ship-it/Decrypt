.class final LF0/T$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/T;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LF0/T$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF0/T$a;

    invoke-direct {v0}, LF0/T$a;-><init>()V

    sput-object v0, LF0/T$a;->D:LF0/T$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/t0;)V
    .locals 1

    .prologue
    invoke-virtual {p1}, LF0/t0;->R()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LF0/t0;->a()LF0/T;

    move-result-object v0

    invoke-static {v0, p1}, LF0/T;->e1(LF0/T;LF0/t0;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/t0;

    invoke-virtual {p0, p1}, LF0/T$a;->a(LF0/t0;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
