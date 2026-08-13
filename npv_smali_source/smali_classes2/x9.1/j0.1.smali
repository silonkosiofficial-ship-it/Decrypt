.class public final synthetic Lx9/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic C:Lx9/k0;


# direct methods
.method public synthetic constructor <init>(Lx9/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx9/j0;->C:Lx9/k0;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx9/j0;->C:Lx9/k0;

    invoke-static {v0}, Lx9/k0;->n(Lx9/k0;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
