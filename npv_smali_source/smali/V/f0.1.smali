.class public final LV/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/M1;


# instance fields
.field private final a:Li7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LV/f0;->a:Li7/n;

    return-void
.end method

.method private final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LV/f0;->a:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(LV/H0;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, LV/f0;->b()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
