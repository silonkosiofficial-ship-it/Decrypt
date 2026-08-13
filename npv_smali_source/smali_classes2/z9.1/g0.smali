.class public final synthetic Lz9/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:Ly7/O;


# direct methods
.method public synthetic constructor <init>(Ly7/O;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz9/g0;->C:Ly7/O;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz9/g0;->C:Ly7/O;

    check-cast p1, Ly9/i;

    invoke-static {v0, p1}, Lz9/h0;->a(Ly7/O;Ly9/i;)Li7/M;

    move-result-object p1

    return-object p1
.end method
