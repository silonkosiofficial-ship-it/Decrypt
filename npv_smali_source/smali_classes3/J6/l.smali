.class public final LJ6/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ6/a;


# static fields
.field public static final a:LJ6/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ6/l;

    invoke-direct {v0}, LJ6/l;-><init>()V

    sput-object v0, LJ6/l;->a:LJ6/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LC6/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lx7/p;

    invoke-virtual {p0, p1, p2}, LJ6/l;->b(LC6/c;Lx7/p;)V

    return-void
.end method

.method public b(LC6/c;Lx7/p;)V
    .locals 3

    const-string v0, "client"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handler"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LC6/c;->D()LO6/g;

    move-result-object p1

    sget-object v0, LO6/g;->g:LO6/g$a;

    invoke-virtual {v0}, LO6/g$a;->a()La7/i;

    move-result-object v0

    new-instance v1, LJ6/l$a;

    const/4 v2, 0x0

    invoke-direct {v1, p2, v2}, LJ6/l$a;-><init>(Lx7/p;Lm7/e;)V

    invoke-virtual {p1, v0, v1}, La7/d;->l(La7/i;Lx7/q;)V

    return-void
.end method
