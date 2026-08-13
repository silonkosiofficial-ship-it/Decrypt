.class final Landroidx/compose/animation/a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/a;->a(Ljava/lang/Object;Landroidx/compose/ui/d;Lx7/l;Lh0/c;Ljava/lang/String;Lx7/l;Lx7/r;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/animation/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/animation/a$a;

    invoke-direct {v0}, Landroidx/compose/animation/a$a;-><init>()V

    sput-object v0, Landroidx/compose/animation/a$a;->D:Landroidx/compose/animation/a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/animation/d;)Lt/k;
    .locals 12

    const/16 p1, 0xdc

    const/16 v0, 0x5a

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {p1, v0, v1, v2, v1}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {v3, v4, v5, v1}, Landroidx/compose/animation/f;->o(Lu/I;FILjava/lang/Object;)Landroidx/compose/animation/h;

    move-result-object v3

    invoke-static {p1, v0, v1, v2, v1}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v6

    const/4 v10, 0x4

    const/4 v11, 0x0

    const v7, 0x3f6b851f    # 0.92f

    const-wide/16 v8, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/compose/animation/f;->s(Lu/I;FJILjava/lang/Object;)Landroidx/compose/animation/h;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroidx/compose/animation/h;->c(Landroidx/compose/animation/h;)Landroidx/compose/animation/h;

    move-result-object p1

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v0, v2, v1, v3, v1}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v0

    invoke-static {v0, v4, v5, v1}, Landroidx/compose/animation/f;->q(Lu/I;FILjava/lang/Object;)Landroidx/compose/animation/j;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/compose/animation/a;->e(Landroidx/compose/animation/h;Landroidx/compose/animation/j;)Lt/k;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/animation/d;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/a$a;->a(Landroidx/compose/animation/d;)Lt/k;

    move-result-object p1

    return-object p1
.end method
