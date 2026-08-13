.class public final Ly9/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly9/E$a;
    }
.end annotation


# static fields
.field public static final a:Ly9/E;

.field private static final b:Lv9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly9/E;

    invoke-direct {v0}, Ly9/E;-><init>()V

    sput-object v0, Ly9/E;->a:Ly9/E;

    sget-object v0, Ly9/E$a;->b:Ly9/E$a;

    sput-object v0, Ly9/E;->b:Lv9/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lv9/f;
    .locals 1

    sget-object v0, Ly9/E;->b:Lv9/f;

    return-object v0
.end method

.method public bridge synthetic b(Lw9/h;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ly9/E;->f(Lw9/h;)Ly9/D;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lw9/j;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ly9/D;

    invoke-virtual {p0, p1, p2}, Ly9/E;->g(Lw9/j;Ly9/D;)V

    return-void
.end method

.method public f(Lw9/h;)Ly9/D;
    .locals 3

    const-string v0, "decoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ly9/r;->b(Lw9/h;)V

    new-instance v0, Ly9/D;

    sget-object v1, Ly7/V;->a:Ly7/V;

    invoke-static {v1}, Lu9/a;->F(Ly7/V;)Lt9/b;

    move-result-object v1

    sget-object v2, Ly9/q;->a:Ly9/q;

    invoke-static {v1, v2}, Lu9/a;->i(Lt9/b;Lt9/b;)Lt9/b;

    move-result-object v1

    invoke-interface {v1, p1}, Lt9/a;->b(Lw9/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {v0, p1}, Ly9/D;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public g(Lw9/j;Ly9/D;)V
    .locals 2

    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ly9/r;->c(Lw9/j;)V

    sget-object v0, Ly7/V;->a:Ly7/V;

    invoke-static {v0}, Lu9/a;->F(Ly7/V;)Lt9/b;

    move-result-object v0

    sget-object v1, Ly9/q;->a:Ly9/q;

    invoke-static {v0, v1}, Lu9/a;->i(Lt9/b;Lt9/b;)Lt9/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lt9/e;->e(Lw9/j;Ljava/lang/Object;)V

    return-void
.end method
