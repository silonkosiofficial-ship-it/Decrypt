.class public final Le2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/V$c;


# static fields
.field public static final a:Le2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le2/c;

    invoke-direct {v0}, Le2/c;-><init>()V

    sput-object v0, Le2/c;->a:Le2/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Ljava/lang/Class;)Landroidx/lifecycle/T;
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/W;->b(Landroidx/lifecycle/V$c;Ljava/lang/Class;)Landroidx/lifecycle/T;

    move-result-object p1

    return-object p1
.end method

.method public b(LF7/c;Lc2/a;)Landroidx/lifecycle/T;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Le2/d;->a:Le2/d;

    invoke-static {p1}, Lw7/a;->b(LF7/c;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p2, p1}, Le2/d;->a(Ljava/lang/Class;)Landroidx/lifecycle/T;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c(Ljava/lang/Class;Lc2/a;)Landroidx/lifecycle/T;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/lifecycle/W;->c(Landroidx/lifecycle/V$c;Ljava/lang/Class;Lc2/a;)Landroidx/lifecycle/T;

    move-result-object p1

    return-object p1
.end method
