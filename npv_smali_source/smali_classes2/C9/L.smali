.class public final synthetic LC9/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic C:Ljava/util/LinkedHashMap;


# direct methods
.method public synthetic constructor <init>(Ljava/util/LinkedHashMap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC9/L;->C:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC9/L;->C:Ljava/util/LinkedHashMap;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-static {v0, p1, p2}, LC9/N$a;->b(Ljava/util/LinkedHashMap;ILjava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p1

    return-object p1
.end method
