.class final LC/D$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/D;->a(LC/E;ILx7/l;Lx7/p;Lx7/l;Lx7/r;ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LC/D$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC/D$a;

    invoke-direct {v0}, LC/D$a;-><init>()V

    sput-object v0, LC/D$a;->D:LC/D$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Void;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, LC/D$a;->a(I)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
