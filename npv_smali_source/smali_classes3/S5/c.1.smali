.class public final LS5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA5/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS5/c$e;,
        LS5/c$f;,
        LS5/c$c;,
        LS5/c$b;,
        LS5/c$a;,
        LS5/c$d;
    }
.end annotation


# static fields
.field public static final a:LA5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS5/c;

    invoke-direct {v0}, LS5/c;-><init>()V

    sput-object v0, LS5/c;->a:LA5/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LA5/b;)V
    .locals 2

    const-class v0, LS5/z;

    sget-object v1, LS5/c$e;->a:LS5/c$e;

    invoke-interface {p1, v0, v1}, LA5/b;->a(Ljava/lang/Class;Lz5/d;)LA5/b;

    const-class v0, LS5/C;

    sget-object v1, LS5/c$f;->a:LS5/c$f;

    invoke-interface {p1, v0, v1}, LA5/b;->a(Ljava/lang/Class;Lz5/d;)LA5/b;

    const-class v0, LS5/e;

    sget-object v1, LS5/c$c;->a:LS5/c$c;

    invoke-interface {p1, v0, v1}, LA5/b;->a(Ljava/lang/Class;Lz5/d;)LA5/b;

    const-class v0, LS5/b;

    sget-object v1, LS5/c$b;->a:LS5/c$b;

    invoke-interface {p1, v0, v1}, LA5/b;->a(Ljava/lang/Class;Lz5/d;)LA5/b;

    const-class v0, LS5/a;

    sget-object v1, LS5/c$a;->a:LS5/c$a;

    invoke-interface {p1, v0, v1}, LA5/b;->a(Ljava/lang/Class;Lz5/d;)LA5/b;

    const-class v0, LS5/u;

    sget-object v1, LS5/c$d;->a:LS5/c$d;

    invoke-interface {p1, v0, v1}, LA5/b;->a(Ljava/lang/Class;Lz5/d;)LA5/b;

    return-void
.end method
