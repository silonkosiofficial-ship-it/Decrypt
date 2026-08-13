.class public final Lx9/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# static fields
.field public static final a:Lx9/y0;

.field private static final b:Lv9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lx9/y0;

    invoke-direct {v0}, Lx9/y0;-><init>()V

    sput-object v0, Lx9/y0;->a:Lx9/y0;

    new-instance v0, Lx9/q0;

    const-string v1, "kotlin.String"

    sget-object v2, Lv9/d$i;->a:Lv9/d$i;

    invoke-direct {v0, v1, v2}, Lx9/q0;-><init>(Ljava/lang/String;Lv9/d;)V

    sput-object v0, Lx9/y0;->b:Lv9/f;

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

    sget-object v0, Lx9/y0;->b:Lv9/f;

    return-object v0
.end method

.method public bridge synthetic b(Lw9/h;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lx9/y0;->f(Lw9/h;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lw9/j;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lx9/y0;->g(Lw9/j;Ljava/lang/String;)V

    return-void
.end method

.method public f(Lw9/h;)Ljava/lang/String;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lw9/h;->o()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public g(Lw9/j;Ljava/lang/String;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lw9/j;->E(Ljava/lang/String;)V

    return-void
.end method
