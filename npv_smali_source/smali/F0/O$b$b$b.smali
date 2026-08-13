.class final LF0/O$b$b$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/O$b$b;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LF0/O$b$b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF0/O$b$b$b;

    invoke-direct {v0}, LF0/O$b$b$b;-><init>()V

    sput-object v0, LF0/O$b$b$b;->D:LF0/O$b$b$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/b;)V
    .locals 1

    invoke-interface {p1}, LF0/b;->f()LF0/a;

    move-result-object v0

    invoke-interface {p1}, LF0/b;->f()LF0/a;

    move-result-object p1

    invoke-virtual {p1}, LF0/a;->l()Z

    move-result p1

    invoke-virtual {v0, p1}, LF0/a;->q(Z)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/b;

    invoke-virtual {p0, p1}, LF0/O$b$b$b;->a(LF0/b;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
