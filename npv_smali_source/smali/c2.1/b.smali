.class public final Lc2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/V$c;


# instance fields
.field private final a:[Lc2/f;


# direct methods
.method public varargs constructor <init>([Lc2/f;)V
    .locals 1

    const-string v0, "initializers"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/b;->a:[Lc2/f;

    return-void
.end method


# virtual methods
.method public synthetic a(Ljava/lang/Class;)Landroidx/lifecycle/T;
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/W;->b(Landroidx/lifecycle/V$c;Ljava/lang/Class;)Landroidx/lifecycle/T;

    move-result-object p1

    return-object p1
.end method

.method public synthetic b(LF7/c;Lc2/a;)Landroidx/lifecycle/T;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/lifecycle/W;->a(Landroidx/lifecycle/V$c;LF7/c;Lc2/a;)Landroidx/lifecycle/T;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Class;Lc2/a;)Landroidx/lifecycle/T;
    .locals 3

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Le2/g;->a:Le2/g;

    invoke-static {p1}, Lw7/a;->e(Ljava/lang/Class;)LF7/c;

    move-result-object p1

    iget-object v1, p0, Lc2/b;->a:[Lc2/f;

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lc2/f;

    invoke-virtual {v0, p1, p2, v1}, Le2/g;->b(LF7/c;Lc2/a;[Lc2/f;)Landroidx/lifecycle/T;

    move-result-object p1

    return-object p1
.end method
