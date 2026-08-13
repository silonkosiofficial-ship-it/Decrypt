.class final Lb8/j$k;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/j;-><init>(La8/g;Lb8/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lb8/j;


# direct methods
.method constructor <init>(Lb8/j;)V
    .locals 0

    iput-object p1, p0, Lb8/j$k;->D:Lb8/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Lb8/j$k;->D:Lb8/j;

    sget-object v1, Ly8/d;->w:Ly8/d;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lb8/j;->t(Ly8/d;Lx7/l;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb8/j$k;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
