.class public final Lx9/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# static fields
.field public static final a:Lx9/s;

.field private static final b:Lv9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lx9/s;

    invoke-direct {v0}, Lx9/s;-><init>()V

    sput-object v0, Lx9/s;->a:Lx9/s;

    new-instance v0, Lx9/q0;

    const-string v1, "kotlin.Double"

    sget-object v2, Lv9/d$d;->a:Lv9/d$d;

    invoke-direct {v0, v1, v2}, Lx9/q0;-><init>(Ljava/lang/String;Lv9/d;)V

    sput-object v0, Lx9/s;->b:Lv9/f;

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

    sget-object v0, Lx9/s;->b:Lv9/f;

    return-object v0
.end method

.method public bridge synthetic b(Lw9/h;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lx9/s;->f(Lw9/h;)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lw9/j;Ljava/lang/Object;)V
    .locals 2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lx9/s;->g(Lw9/j;D)V

    return-void
.end method

.method public f(Lw9/h;)Ljava/lang/Double;
    .locals 2

    const-string v0, "decoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lw9/h;->F()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public g(Lw9/j;D)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2, p3}, Lw9/j;->g(D)V

    return-void
.end method
