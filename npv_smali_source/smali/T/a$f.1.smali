.class final LT/a$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/a;->c(ZZLV/n;II)LV/G1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LT/s;

.field final synthetic E:Landroid/view/accessibility/AccessibilityManager;


# direct methods
.method constructor <init>(LT/s;Landroid/view/accessibility/AccessibilityManager;)V
    .locals 0

    iput-object p1, p0, LT/a$f;->D:LT/s;

    iput-object p2, p0, LT/a$f;->E:Landroid/view/accessibility/AccessibilityManager;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LT/a$f;->D:LT/s;

    iget-object v1, p0, LT/a$f;->E:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0, v1}, LT/s;->s(Landroid/view/accessibility/AccessibilityManager;)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LT/a$f;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
