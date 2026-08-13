.class final Lt/j$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lt/j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt/j$a;

    invoke-direct {v0}, Lt/j$a;-><init>()V

    sput-object v0, Lt/j$a;->D:Lt/j$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lp0/c;)Lu/x0;
    .locals 2

    sget-object v0, Lt/j$a$a;->D:Lt/j$a$a;

    new-instance v1, Lt/j$a$b;

    invoke-direct {v1, p1}, Lt/j$a$b;-><init>(Lp0/c;)V

    invoke-static {v0, v1}, Lu/z0;->a(Lx7/l;Lx7/l;)Lu/x0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lp0/c;

    invoke-virtual {p0, p1}, Lt/j$a;->a(Lp0/c;)Lu/x0;

    move-result-object p1

    return-object p1
.end method
