.class final Lv/J$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/J;->L0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lv/J;


# direct methods
.method constructor <init>(Lv/J;)V
    .locals 0

    iput-object p1, p0, Lv/J$d;->D:Lv/J;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lv/J$d;->D:Lv/J;

    invoke-static {v0}, Lv/J;->X1(Lv/J;)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lv/J$d;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
