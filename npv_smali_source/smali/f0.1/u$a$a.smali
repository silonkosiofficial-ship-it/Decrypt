.class public final Lf0/u$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf0/u$a;-><init>(Lx7/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf0/u$a;


# direct methods
.method constructor <init>(Lf0/u$a;)V
    .locals 0

    iput-object p1, p0, Lf0/u$a$a;->a:Lf0/u$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LV/J;)V
    .locals 1

    iget-object p1, p0, Lf0/u$a$a;->a:Lf0/u$a;

    invoke-static {p1}, Lf0/u$a;->a(Lf0/u$a;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Lf0/u$a;->b(Lf0/u$a;I)V

    return-void
.end method

.method public b(LV/J;)V
    .locals 1

    iget-object p1, p0, Lf0/u$a$a;->a:Lf0/u$a;

    invoke-static {p1}, Lf0/u$a;->a(Lf0/u$a;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Lf0/u$a;->b(Lf0/u$a;I)V

    return-void
.end method
