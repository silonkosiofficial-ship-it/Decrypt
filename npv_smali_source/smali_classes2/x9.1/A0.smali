.class public final synthetic Lx9/A0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic C:Lx9/B0;

.field public final synthetic D:Lt9/a;

.field public final synthetic E:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lx9/B0;Lt9/a;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx9/A0;->C:Lx9/B0;

    iput-object p2, p0, Lx9/A0;->D:Lt9/a;

    iput-object p3, p0, Lx9/A0;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lx9/A0;->C:Lx9/B0;

    iget-object v1, p0, Lx9/A0;->D:Lt9/a;

    iget-object v2, p0, Lx9/A0;->E:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lx9/B0;->G(Lx9/B0;Lt9/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
