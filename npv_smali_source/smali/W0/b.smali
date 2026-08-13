.class public final LW0/b;
.super Landroid/text/style/CharacterStyle;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/UpdateAppearance;


# instance fields
.field private final a:Lo0/a2;

.field private final b:F

.field private final c:LV/w0;

.field private final d:LV/G1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lo0/a2;F)V
    .locals 1

    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    iput-object p1, p0, LW0/b;->a:Lo0/a2;

    iput p2, p0, LW0/b;->b:F

    sget-object p1, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {p1}, Ln0/m$a;->a()J

    move-result-wide p1

    invoke-static {p1, p2}, Ln0/m;->c(J)Ln0/m;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x2

    invoke-static {p1, p2, v0, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LW0/b;->c:LV/w0;

    new-instance p1, LW0/b$a;

    invoke-direct {p1, p0}, LW0/b$a;-><init>(LW0/b;)V

    invoke-static {p1}, LV/v1;->e(Lx7/a;)LV/G1;

    move-result-object p1

    iput-object p1, p0, LW0/b;->d:LV/G1;

    return-void
.end method


# virtual methods
.method public final a()Lo0/a2;
    .locals 1

    iget-object v0, p0, LW0/b;->a:Lo0/a2;

    return-object v0
.end method

.method public final b()J
    .locals 2

    iget-object v0, p0, LW0/b;->c:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/m;

    invoke-virtual {v0}, Ln0/m;->m()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c(J)V
    .locals 1

    iget-object v0, p0, LW0/b;->c:LV/w0;

    invoke-static {p1, p2}, Ln0/m;->c(J)Ln0/m;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    iget v0, p0, LW0/b;->b:F

    invoke-static {p1, v0}, LU0/h;->a(Landroid/text/TextPaint;F)V

    iget-object v0, p0, LW0/b;->d:LV/G1;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Shader;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void
.end method
