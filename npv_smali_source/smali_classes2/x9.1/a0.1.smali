.class public final synthetic Lx9/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic C:Ljava/lang/String;

.field public final synthetic D:Lx9/c0;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lx9/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx9/a0;->C:Ljava/lang/String;

    iput-object p2, p0, Lx9/a0;->D:Lx9/c0;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lx9/a0;->C:Ljava/lang/String;

    iget-object v1, p0, Lx9/a0;->D:Lx9/c0;

    invoke-static {v0, v1}, Lx9/c0;->g(Ljava/lang/String;Lx9/c0;)Lv9/f;

    move-result-object v0

    return-object v0
.end method
