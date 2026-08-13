.class final Lb8/j$g;
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

    iput-object p1, p0, Lb8/j$g;->D:Lb8/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lb8/b;
    .locals 1

    iget-object v0, p0, Lb8/j$g;->D:Lb8/j;

    invoke-virtual {v0}, Lb8/j;->p()Lb8/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb8/j$g;->a()Lb8/b;

    move-result-object v0

    return-object v0
.end method
