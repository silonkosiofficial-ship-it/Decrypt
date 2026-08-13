.class public final LJ6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ6/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ6/k$a;
    }
.end annotation


# static fields
.field public static final a:LJ6/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ6/k;

    invoke-direct {v0}, LJ6/k;-><init>()V

    sput-object v0, LJ6/k;->a:LJ6/k;

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

    check-cast p2, Lx7/q;

    invoke-virtual {p0, p1, p2}, LJ6/k;->b(LC6/c;Lx7/q;)V

    return-void
.end method

.method public b(LC6/c;Lx7/q;)V
    .locals 3

    const-string v0, "client"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handler"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LI6/E;->c:LI6/E$d;

    invoke-static {p1, v0}, LI6/s;->b(LC6/c;LI6/r;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI6/E;

    new-instance v1, LJ6/k$b;

    const/4 v2, 0x0

    invoke-direct {v1, p2, p1, v2}, LJ6/k$b;-><init>(Lx7/q;LC6/c;Lm7/e;)V

    invoke-virtual {v0, v1}, LI6/E;->d(Lx7/q;)V

    return-void
.end method
