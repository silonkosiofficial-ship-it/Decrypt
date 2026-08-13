.class public final LG8/b$a$a;
.super LF8/d0$c$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG8/b$a;->j0(LG8/b;LJ8/j;)LF8/d0$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LG8/b;

.field final synthetic b:LF8/n0;


# direct methods
.method constructor <init>(LG8/b;LF8/n0;)V
    .locals 0

    iput-object p1, p0, LG8/b$a$a;->a:LG8/b;

    iput-object p2, p0, LG8/b$a$a;->b:LF8/n0;

    invoke-direct {p0}, LF8/d0$c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LF8/d0;LJ8/i;)LJ8/j;
    .locals 2

    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "type"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LG8/b$a$a;->a:LG8/b;

    iget-object v0, p0, LG8/b$a$a;->b:LF8/n0;

    invoke-interface {p1, p2}, LJ8/o;->z(LJ8/i;)LJ8/j;

    move-result-object p2

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType"

    invoke-static {p2, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, LF8/E;

    sget-object v1, LF8/u0;->G:LF8/u0;

    invoke-virtual {v0, p2, v1}, LF8/n0;->n(LF8/E;LF8/u0;)LF8/E;

    move-result-object p2

    const-string v0, "safeSubstitute(...)"

    invoke-static {p2, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, LG8/b;->b(LJ8/i;)LJ8/j;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object p1
.end method
