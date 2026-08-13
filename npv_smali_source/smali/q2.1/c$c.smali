.class final Lq2/c$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq2/c;-><init>(Ly2/c;Ljava/lang/String;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly2/c;

.field final synthetic E:Ljava/lang/String;


# direct methods
.method constructor <init>(Ly2/c;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lq2/c$c;->D:Ly2/c;

    iput-object p2, p0, Lq2/c$c;->E:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ly2/b;
    .locals 2

    iget-object v0, p0, Lq2/c$c;->D:Ly2/c;

    iget-object v1, p0, Lq2/c$c;->E:Ljava/lang/String;

    invoke-interface {v0, v1}, Ly2/c;->a(Ljava/lang/String;)Ly2/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lq2/c$c;->a()Ly2/b;

    move-result-object v0

    return-object v0
.end method
