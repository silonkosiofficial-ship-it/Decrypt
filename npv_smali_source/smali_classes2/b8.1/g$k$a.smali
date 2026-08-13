.class final Lb8/g$k$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/g$k;->a(Ln8/f;)LO7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lb8/g;


# direct methods
.method constructor <init>(Lb8/g;)V
    .locals 0

    iput-object p1, p0, Lb8/g$k$a;->D:Lb8/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 2

    iget-object v0, p0, Lb8/g$k$a;->D:Lb8/g;

    invoke-virtual {v0}, Lb8/j;->a()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lb8/g$k$a;->D:Lb8/g;

    invoke-virtual {v1}, Lb8/j;->d()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lj7/Z;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb8/g$k$a;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
