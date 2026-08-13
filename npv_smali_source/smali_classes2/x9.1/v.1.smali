.class public final synthetic Lx9/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic C:I

.field public final synthetic D:Ljava/lang/String;

.field public final synthetic E:Lx9/w;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Lx9/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lx9/v;->C:I

    iput-object p2, p0, Lx9/v;->D:Ljava/lang/String;

    iput-object p3, p0, Lx9/v;->E:Lx9/w;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lx9/v;->C:I

    iget-object v1, p0, Lx9/v;->D:Ljava/lang/String;

    iget-object v2, p0, Lx9/v;->E:Lx9/w;

    invoke-static {v0, v1, v2}, Lx9/w;->A(ILjava/lang/String;Lx9/w;)[Lv9/f;

    move-result-object v0

    return-object v0
.end method
