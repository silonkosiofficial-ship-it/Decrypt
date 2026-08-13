.class public final LS/V$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS/V;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LS/V$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LS/P0;Ljava/util/Locale;)Le0/j;
    .locals 2

    sget-object v0, LS/V$a$a;->D:LS/V$a$a;

    new-instance v1, LS/V$a$b;

    invoke-direct {v1, p1, p2}, LS/V$a$b;-><init>(LS/P0;Ljava/util/Locale;)V

    invoke-static {v0, v1}, Le0/a;->a(Lx7/p;Lx7/l;)Le0/j;

    move-result-object p1

    return-object p1
.end method
