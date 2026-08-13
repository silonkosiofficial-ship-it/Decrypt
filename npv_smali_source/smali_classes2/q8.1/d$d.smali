.class final Lq8/d$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq8/d;-><init>(Lq8/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lq8/d;


# direct methods
.method constructor <init>(Lq8/d;)V
    .locals 0

    iput-object p1, p0, Lq8/d$d;->D:Lq8/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lq8/d;
    .locals 2

    iget-object v0, p0, Lq8/d$d;->D:Lq8/d;

    sget-object v1, Lq8/d$d$a;->D:Lq8/d$d$a;

    invoke-virtual {v0, v1}, Lq8/c;->y(Lx7/l;)Lq8/c;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lq8/d;

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lq8/d$d;->a()Lq8/d;

    move-result-object v0

    return-object v0
.end method
