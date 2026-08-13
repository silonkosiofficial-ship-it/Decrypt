.class final LC/j$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LC/j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC/j$a;

    invoke-direct {v0}, LC/j$a;-><init>()V

    sput-object v0, LC/j$a;->D:LC/j$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LC/q;I)J
    .locals 0

    const/4 p1, 0x1

    invoke-static {p1}, LC/I;->a(I)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LC/q;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LC/j$a;->a(LC/q;I)J

    move-result-wide p1

    invoke-static {p1, p2}, LC/c;->a(J)LC/c;

    move-result-object p1

    return-object p1
.end method
