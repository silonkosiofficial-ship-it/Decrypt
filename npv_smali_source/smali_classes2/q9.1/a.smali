.class public final Lq9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lq9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq9/a;

    invoke-direct {v0}, Lq9/a;-><init>()V

    sput-object v0, Lq9/a;->a:Lq9/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([B)Lp9/a;
    .locals 1

    const-string v0, "array"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lp9/a;->E:Lp9/a$a;

    invoke-virtual {v0, p1}, Lp9/a$a;->a([B)Lp9/a;

    move-result-object p1

    return-object p1
.end method
