.class public final LA/T$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/T$a$a;->a(LV/N;)LV/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LA/T;

.field final synthetic b:Landroid/view/View;


# direct methods
.method public constructor <init>(LA/T;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, LA/T$a$a$a;->a:LA/T;

    iput-object p2, p0, LA/T$a$a$a;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    iget-object v0, p0, LA/T$a$a$a;->a:LA/T;

    iget-object v1, p0, LA/T$a$a$a;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, LA/T;->b(Landroid/view/View;)V

    return-void
.end method
