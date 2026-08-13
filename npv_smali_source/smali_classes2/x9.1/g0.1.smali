.class public final synthetic Lx9/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:Lx9/k0;


# direct methods
.method public synthetic constructor <init>(Lx9/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx9/g0;->C:Lx9/k0;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx9/g0;->C:Lx9/k0;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, Lx9/k0;->l(Lx9/k0;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
