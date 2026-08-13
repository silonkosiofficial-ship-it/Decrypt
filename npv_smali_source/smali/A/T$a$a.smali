.class final LA/T$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/T$a;->c(LV/n;I)LA/T;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LA/T;

.field final synthetic E:Landroid/view/View;


# direct methods
.method constructor <init>(LA/T;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, LA/T$a$a;->D:LA/T;

    iput-object p2, p0, LA/T$a$a;->E:Landroid/view/View;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/N;)LV/M;
    .locals 2

    iget-object p1, p0, LA/T$a$a;->D:LA/T;

    iget-object v0, p0, LA/T$a$a;->E:Landroid/view/View;

    invoke-virtual {p1, v0}, LA/T;->e(Landroid/view/View;)V

    iget-object p1, p0, LA/T$a$a;->D:LA/T;

    iget-object v0, p0, LA/T$a$a;->E:Landroid/view/View;

    new-instance v1, LA/T$a$a$a;

    invoke-direct {v1, p1, v0}, LA/T$a$a$a;-><init>(LA/T;Landroid/view/View;)V

    return-object v1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/N;

    invoke-virtual {p0, p1}, LA/T$a$a;->a(LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
