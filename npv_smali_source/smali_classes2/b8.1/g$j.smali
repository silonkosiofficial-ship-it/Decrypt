.class final Lb8/g$j;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/g;-><init>(La8/g;LO7/e;Le8/g;ZLb8/g;)V
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

    iput-object p1, p0, Lb8/g$j;->D:Lb8/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lb8/g$j;->D:Lb8/g;

    invoke-static {v0}, Lb8/g;->Q(Lb8/g;)Le8/g;

    move-result-object v0

    invoke-interface {v0}, Le8/g;->Q()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lj7/v;->Y0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb8/g$j;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
