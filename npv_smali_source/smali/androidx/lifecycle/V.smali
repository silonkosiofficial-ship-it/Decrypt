.class public Landroidx/lifecycle/V;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/V$a;,
        Landroidx/lifecycle/V$b;,
        Landroidx/lifecycle/V$c;,
        Landroidx/lifecycle/V$d;,
        Landroidx/lifecycle/V$e;
    }
.end annotation


# static fields
.field public static final b:Landroidx/lifecycle/V$b;

.field public static final c:Lc2/a$b;


# instance fields
.field private final a:Lc2/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/lifecycle/V$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/lifecycle/V$b;-><init>(Ly7/k;)V

    sput-object v0, Landroidx/lifecycle/V;->b:Landroidx/lifecycle/V$b;

    sget-object v0, Le2/g$a;->a:Le2/g$a;

    sput-object v0, Landroidx/lifecycle/V;->c:Lc2/a$b;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/X;Landroidx/lifecycle/V$c;)V
    .locals 7

    const-string v0, "store"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Landroidx/lifecycle/V;-><init>(Landroidx/lifecycle/X;Landroidx/lifecycle/V$c;Lc2/a;ILy7/k;)V

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/X;Landroidx/lifecycle/V$c;Lc2/a;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCreationExtras"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc2/g;

    invoke-direct {v0, p1, p2, p3}, Lc2/g;-><init>(Landroidx/lifecycle/X;Landroidx/lifecycle/V$c;Lc2/a;)V

    invoke-direct {p0, v0}, Landroidx/lifecycle/V;-><init>(Lc2/g;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/lifecycle/X;Landroidx/lifecycle/V$c;Lc2/a;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    sget-object p3, Lc2/a$a;->b:Lc2/a$a;

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroidx/lifecycle/V;-><init>(Landroidx/lifecycle/X;Landroidx/lifecycle/V$c;Lc2/a;)V

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/Y;Landroidx/lifecycle/V$c;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/lifecycle/Y;->n()Landroidx/lifecycle/X;

    move-result-object v0

    sget-object v1, Le2/g;->a:Le2/g;

    invoke-virtual {v1, p1}, Le2/g;->c(Landroidx/lifecycle/Y;)Lc2/a;

    move-result-object p1

    invoke-direct {p0, v0, p2, p1}, Landroidx/lifecycle/V;-><init>(Landroidx/lifecycle/X;Landroidx/lifecycle/V$c;Lc2/a;)V

    return-void
.end method

.method private constructor <init>(Lc2/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/V;->a:Lc2/g;

    return-void
.end method


# virtual methods
.method public final a(LF7/c;)Landroidx/lifecycle/T;
    .locals 3

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/V;->a:Lc2/g;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lc2/g;->b(Lc2/g;LF7/c;Ljava/lang/String;ILjava/lang/Object;)Landroidx/lifecycle/T;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Class;)Landroidx/lifecycle/T;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lw7/a;->e(Ljava/lang/Class;)LF7/c;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/lifecycle/V;->a(LF7/c;)Landroidx/lifecycle/T;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/String;LF7/c;)Landroidx/lifecycle/T;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modelClass"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/V;->a:Lc2/g;

    invoke-virtual {v0, p2, p1}, Lc2/g;->a(LF7/c;Ljava/lang/String;)Landroidx/lifecycle/T;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/T;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modelClass"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/V;->a:Lc2/g;

    invoke-static {p2}, Lw7/a;->e(Ljava/lang/Class;)LF7/c;

    move-result-object p2

    invoke-virtual {v0, p2, p1}, Lc2/g;->a(LF7/c;Ljava/lang/String;)Landroidx/lifecycle/T;

    move-result-object p1

    return-object p1
.end method
